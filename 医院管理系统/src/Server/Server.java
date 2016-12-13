package Server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import all_class.Account;
import all_class.Drug_info;
import all_class.Office;

public class Server {
	private static  ArrayList<Account> account_list=new ArrayList<Account>();//����˺���Ϣ
	private static  ArrayList<Drug_info> drug_list=new ArrayList<Drug_info>();//ҩƷ����Ϣ
	private static ArrayList<Office> office_list=new ArrayList<Office>();
	public static void add_Account_list(Account account){
		account_list.add(account);
	}
	public ArrayList<Account> get_Account_list(){
		return account_list;
	}
	
	public static void add_Drug_list(Drug_info drug_info)
	{
		drug_list.add(drug_info);
	}
	public ArrayList<Drug_info> get_Drug_list(){
		return drug_list;
	}
	public static void add_Office_list(Office office)
	{
		office_list.add(office);
	}
	public static void Read_Account() throws IOException{
		FileReader in=new FileReader(".//�˺���Ϣ.txt");
		BufferedReader br=new BufferedReader(in);
		String str;
		
		while((str=br.readLine())!=null)//���˺���Ϣ����ArrayList
		{
			 String[]group= str.split(" ");
			 Account account=new Account(group[0],group[1],Integer.parseInt(group[2]));
			 add_Account_list(account);
		}
		in.close();
	}
	public static void Read_Drug() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(".//ҩƷ��Ϣ.txt"));
		String values;
		
		while((values=br.readLine())!=null)
		{
			String[]group=values.split(" ");
			//System.out.println(group[3]);
			Drug_info drug=new Drug_info(group[0],group[1],Float.parseFloat(group[2]),Integer.parseInt(group[3]));
			drug_list.add(drug);
			
		}
		br.close();
	}
	public static void Read_Office() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(".//������Ϣ"));
		String values;
		while((values=br.readLine())!=null)
		{
			
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //Read_Account();
		Read_Drug();
	}

}
