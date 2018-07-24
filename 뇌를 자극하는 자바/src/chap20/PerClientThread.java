package chap20;
import java.io.*;
import java.net.*;
import java.util.*;


public class PerClientThread extends Thread {
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket;
	PrintWriter writer;

			

}
