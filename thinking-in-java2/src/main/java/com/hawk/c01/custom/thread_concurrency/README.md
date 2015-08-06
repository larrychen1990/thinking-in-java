
### http://www.programcreek.com/java-threads/


- synchronized keyword is used for exclusive accessing.
- To make a method synchronized, simply add the synchronized keyword to its declaration. Then no two invocations of synchronized methods on the same object can interleave with each other.
- Synchronized statements must specify the object that provides the intrinsic lock. When synchronized(this) is used, you have to avoid to synchronizing invocations of other objects' methods.
- wait() tells the calling thread to give up the monitor and go to sleep until some other thread enters the same monitor and calls notify( ).
- notify() wakes up the first thread that called wait() on the same object.