package com.hawk.c01.custom.io.crawler;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseHTML {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.baidu.com").get();
			Elements titles = doc.select(".entrytitle");
			
			for (Element e : titles) {
				System.out.println("text: " + e.text());
				System.out.println("html: " + e.html());
			}
			
			Elements links = doc.select("a[href]");
			
			for (Element l : links) {
				System.out.println("link: " + l.attr("abs:href"));
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
