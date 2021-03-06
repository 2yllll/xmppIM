package quinn.xmpp.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.jivesoftware.smackx.filetransfer.FileTransferRequest;

import quinn.xmpp.database.RowContacts;
import quinn.xmpp.model.BubbleMessage;
import quinn.xmpp.model.ViewEntry;
import quinn.xmpp.model.ViewXMPPGroup;
import quinn.xmpp.smack.Smack;


public class Test {
	
	public static void outputRequestMap(HashMap<String, ArrayList<FileTransferRequest>> requestMap){
		L.i("TEST : output the request Map");
		Set<String> keySet = (Set<String>) requestMap.keySet();
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()){
			String u_jid = iter.next();
			L.i("request from " + u_jid);
			ArrayList<FileTransferRequest> list = requestMap.get(u_jid);
			for(int i = 0; i < list .size(); i++){
				L.i("file name " + list.get(i).getFileName());
			}
			
		}
	}
	public static void output2levelString(String[][] _2levelString){
		L.i("TEST : output 2 Level String");
		int i = 0;
		for(String[] list:_2levelString){
			L.i("dimension : " + i++);
		
			for(String item:list){
				L.i("item: " + item);
			}
		}
	}
	public static void output1levelString(String[] list){
		L.i("TEST : output 1 Level String");
		for(String item:list){
			L.i("item: " + item);
		}
	}
	
	public static void outputMessageBubbleList(ArrayList<BubbleMessage> list){
		for(int i = 0; i < list.size();i++){
			L.i("bubble=====  " + list.get(i).toString());
		}
	}
	public static void outputConnectedUser(Smack smack){
		L.i("TEST : output current connection info");
		L.i("connect ip " + smack.getConnection().getHost());
		L.i("connect port " + smack.getConnection().getPort());
		L.i("connect username " + smack.getConnection().getUser().toString());
	}
	
	

	
	
	public static void outputCertainString(String iofo,String content){
		L.i("TEST : " + iofo);
		L.i(" = " + content);
	}
	
	
	public static void outputContactsRows (ArrayList<RowContacts> rows){
		for(int i = 0; i < rows.size(); i++){
			System.out.println(rows.get(i).toString());
		}
	}
	
	public static void outputViewRoster(ArrayList<ViewXMPPGroup> groupList){
		for(int i = 0; i < groupList.size(); i++){
			ViewXMPPGroup group = new ViewXMPPGroup();
			group = groupList.get(i);
			L.i("----------------Group-------------------------------");
			L.i("group name  " + group.getGroupName());
			L.i("online sum   " + String.valueOf(group.getOnlineSum()));
			for(int j = 0; j < groupList.get(i).getEntryList().size();j++){
				ViewEntry entry = new ViewEntry();
				entry = groupList.get(i).getEntryList().get(j);
				L.i("----------friend----------");
				L.i("friendID  " + entry.getFriend_jID());
				L.i("nickname  " + entry.getNickname());
				L.i("online " + entry.getOnline());
				L.i("getPhoto  " + entry.getPhoto());
				L.i("getSignature  " + entry.getSignature());
			}
			
			
		}
		
		
	}
	
}
