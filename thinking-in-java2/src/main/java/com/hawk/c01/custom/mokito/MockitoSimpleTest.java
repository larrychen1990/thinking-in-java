package com.hawk.c01.custom.mokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.InOrder;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;



public class MockitoSimpleTest {
	private final Log logger=LogFactory.getLog(getClass());
	
	
	@Test	
	public void testReturn() {
		// arrange
		Iterator i = mock(Iterator.class);
		when(i.next()).thenReturn("Hello").thenReturn("World");
		// act
		String result = i.next() + " " + i.next();
		// verify
		verify(i, times(2)).next();
		// assert
		assertEquals("Hello World", result);
		
	}
	
	
	@Test
		public void testVoid() {
			MockitoSimpleTest mock = mock(MockitoSimpleTest.class);
			doReturn(null).when(mock).doNothing();
			
			//illeagle
	//		when(mock.doNothing()).thenReturn(0);
	//		mock.doNothing();
		}


	@Test
	public void testAnswer() {
		List<String> mock = mock(List.class);
		when(mock.get(4)).thenAnswer(new CustomAnswer());
		System.out.println(mock.get(4));
	}


	@Test
	public void testAnswer2() {
		/**
		 * 
		when(mock.someMethod(anyString())).thenAnswer(new Answer() {  
	    Object answer(InvocationOnMock invocation) {  
	        Object[] args = invocation.getArguments();  
	        Object mock = invocation.getMock();  
	        return mock+" called with arguments: " + args;  
	    	}  
		});  
	
		//Following prints "called with arguments: foo"  
		System.out.println(mock.someMethod("foo"));  
		
		
		
		doThrow(new RuntimeException()).when(mockedList).clear();  
	
		//following throws RuntimeException:  
		mockedList.clear();  
		 * 
		 * */
		
		
	}


	@Test
	public void testException() {
		//You can mock concrete classes, not only interfaces  
		LinkedList mockedList = mock(LinkedList.class);  
		  
		// stubbing  
		when(mockedList.get(0)).thenReturn("first");  
		when(mockedList.get(1)).thenThrow(new RuntimeException());  
		
		//when stubbing more than onece the most recently works
		when(mockedList.get(0)).thenReturn("first");  
		when(mockedList.get(0)).thenReturn("oops");  
		System.out.println(mockedList.get(0));  
		System.out.println(mockedList.get(0));  
		  
		// following prints "first"  
		System.out.println(mockedList.get(0)); 
		
		// following throws runtime exception  
//		System.out.println(mockedList.get(1));
		
		// following prints "null" because get(999) was not stubbed  
		System.out.println(mockedList.get(999));  
		  
		// Although it is possible to verify a stubbed invocation, usually it's just redundant  
		// See http://monkeyisland.pl/2008/04/26/asking-and-telling  
//		verify(mockedList, atLeast(2)).get(0);  
		
		
		
		
	}
	
	@Test
	public void testException2() {
			MockitoSimpleTest mockitoSimpleTest = mock(getClass());
			
			try {
//				doThrow(new RuntimeException()).when(mockitoSimpleTest).throwExceprions();
//				doReturn("").when(mockitoSimpleTest).throwExceprions();
				
//				mockitoSimpleTest.throwExceprions();
				verify(mockitoSimpleTest).throwExceprions();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void testVerify() {
		//mock creation  
		List mockedList = mock(List.class);  
		  
		// using mock object  
		mockedList.add("one");  
		mockedList.clear();  
		mockedList.add("3"); // no verify? OK  
		  
		// verification  
		verify(mockedList).add("one");  //we have used the method 
		verify(mockedList).clear();  	//
//		 verify(mockedList).add("2"); 	// this will throw an exception  because we don't use the add("2") method
		 
		 
		
		 // stubbing using built-in anyInt() argument matcher  
		 when(mockedList.get(anyInt())).thenReturn("element");  
		 
		 // following prints "element"  
		 System.out.println(mockedList.get(999));  
		 
		 // you can also verify using an argument matcher  
		 verify(mockedList).get(anyInt());  
		 
		// correct  
//		 verify(mock).someMethod(anyInt(), anyString(), eq("third argument"));  
		 // will throw exception  
//		 verify(mock).someMethod(anyInt(), anyString(), "third argument");  
		 
		 
		 
		
	}
	
	@Test
	public void testVerifyTimes() {
		
		LinkedList mockedList = mock(LinkedList.class);  
		
		//using mock   
		mockedList.add("once");  
		  
		mockedList.add("twice");  
		mockedList.add("twice");  
		  
		mockedList.add("three times");  
		mockedList.add("three times");  
		mockedList.add("three times");  
		  
		//following two verifications work exactly the same - times(1) is used by default  
		verify(mockedList).add("once");  
		verify(mockedList, times(1)).add("once");  
		  
		//exact number of invocations verification  
		verify(mockedList, times(2)).add("twice");  
		verify(mockedList, times(3)).add("three times");  
		  
		//verification using never(). never() is an alias to times(0)  
		verify(mockedList, never()).add("never happened");  
		  
		//verification using atLeast()/atMost()  
		verify(mockedList, atLeastOnce()).add("three times");  
		verify(mockedList, atLeast(2)).add("twice");  
		verify(mockedList, atMost(5)).add("three times");  
		
	}
	
	@Test
	public void testVerifyOrder() {
		
		// A. Single mock whose methods must be invoked in a particular order  
		List singleMock = mock(List.class);  
		  
		//using a single mock  
		singleMock.add("was added first");  
		singleMock.add("was added second");  
		  
		//create an inOrder verifier for a single mock  
		InOrder inOrder = inOrder(singleMock);  
		  
		//following will make sure that add is first called with "was added first, then with "was added second"  
		inOrder.verify(singleMock).add("was added first");  
		inOrder.verify(singleMock).add("was added second");  
		  
		// B. Multiple mocks that must be used in a particular order  
		List firstMock = mock(List.class);  
		List secondMock = mock(List.class);  
		  
		//using mocks  
		firstMock.add("was called first");  
		secondMock.add("was called second");  
		  
		//create inOrder object passing any mocks that need to be verified in order  
		InOrder inOrder2 = inOrder(firstMock,secondMock);  
		  
		//following will make sure that firstMock was called before secondMock  
		inOrder2.verify(firstMock).add("was called first");  
		inOrder2.verify(secondMock).add("was called second");  
		  
		// Oh, and A + B can be mixed together at will  
		
		
		//using mocks  
		singleMock.add("one");  
		singleMock.add("two");  
		  
		
		verify(singleMock).add("one");  
//		verify(singleMock).add("two");  
		  
		//following verification will fail 
		//if this method success then all of the method in the class exced
		verifyNoMoreInteractions(singleMock);  
	}
	
	@Test
	public void testVerifyDIYMethod() throws Exception {
		//failure
//		LinkedList mock = mock(LinkedList.class);
//		verify(mock).add("one");
		
		//if the object is a class object defined by 
		//yourself then the verify will exec the method
		MockitoSimpleTest mock2 = mock(getClass());
		mock2.throwExceprions();			//exec first time
		
		verify(mock2).throwExceprions();	////exec the tiwce time
	}
	
	@Test
	public void testSPY() {
		//this method  like the spring AOP someways
		//in fact spy only copy the object
		//we can't spy a final object
		
		List list = new LinkedList();  
		List spy = spy(list);  
		  
		//optionally, you can stub out some methods:  
		when(spy.size()).thenReturn(100);  
		   
		//using the spy calls <b>real</b> methods  
		spy.add("one");  	
		spy.add("two");  
		   
		//prints "one" - the first element of a list  
		System.out.println(spy.get(0));  
		   
		//size() method was stubbed - 100 is printed  
		System.out.println(spy.size());  
		   
		//optionally, you can verify  
		verify(spy).add("one");  
		verify(spy).add("two");  
		
	}
	
	@Test
	public void testSPY2() {
		List list = new LinkedList();  
		List spy = spy(list);  
		  
		//Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)  
//		when(spy.get(0)).thenReturn("foo");  
		  
		//You have to use doReturn() for stubbing  
		doReturn("foo").when(spy).get(0);  
		
		System.out.println(spy.get(0));
	}
	
	@Test
	public void testArguments() {
		List mockedList = mock(LinkedList.class);
//				new LinkedList();  
		
		//stubbing using built-in anyInt() argument matcher
		when(mockedList.get(anyInt())).thenReturn("element");
//		doReturn("element").when(mockedList).get(anyInt());
		 
//		//stubbing using hamcrest (let's say isValid() returns your own hamcrest matcher):
//		when(mockedList.contains(argThat(isValid()))).thenReturn("element");
		//following prints "element"
		System.out.println(mockedList.get(999));
		//you can also verify using an argument matcher
		verify(mockedList).get(anyInt());

	}
	
	@Test
	public void testArgumentMatchers() {
		List mock = mock(List.class);
		when(mock.addAll(argThat(new IsListOfTwoElements()))).thenReturn(true);
		mock.addAll(Arrays.asList("one","two"));
//		mock.addAll(Arrays.asList("one","two","three","four"));
		verify(mock).addAll(argThat(new IsListOfTwoElements()));
		
		Object[] o=new Object[]{1,2};
		Object[] o2=new Object[]{1,2};
//		Assert.assertArrayEquals(o,o2);
		Assert.assertEquals(o,o2);
	}
	
	@Test
		public void testMoreReturn() {
			/**
			 * 
			when(mock.someMethod("some arg"))  
			  .thenThrow(new RuntimeException())  
			  .thenReturn("foo");  
			  
			//First call: throws runtime exception:  
			mock.someMethod("some arg");  
			  
			//Second call: prints "foo"  
			System.out.println(mock.someMethod("some arg"));  
			  
			//Any consecutive call: prints "foo" as well (last stubbing wins).   
			System.out.println(mock.someMethod("some arg"));  
			
			
			
			when(mock.someMethod("some arg"))  
	  .thenReturn("one", "two", "three");  
			 * 
			 * */
			
			
		}


	private static void throwExceprions() throws Exception{
			
	//		throw new Exception();
			System.out.println("throwExceprions");
		}


	private void doNothing() {
		System.out.println("Do nothing here!");
	}
	
}

class CustomAnswer implements Answer<String>{

	public String answer(InvocationOnMock invocation) throws Throwable {
		Object[] args = invocation.getArguments();
        Integer num = (Integer)args[0];
        if( num>3 ){
            return "yes";
        } else {
            throw new RuntimeException();
        }
	}
}

class IsListOfTwoElements extends ArgumentMatcher<List>{
	@Override
	public boolean matches(Object list) {
		return ((List)list).size()==2;
	}
}