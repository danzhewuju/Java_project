package all_class;

import java.util.ArrayList;
import java.util.HashMap;

public class Global_info {
ArrayList<Office> Count_office;//所有科室的数组
ArrayList <Account> Account_list;//账号的数组
HashMap Sorage_frug;
public ArrayList<Office> getCount_office() {
	return Count_office;
}
public void setCount_office(ArrayList<Office> count_office) {
	Count_office = count_office;
}
public ArrayList<Account> getAccount_list() {
	return Account_list;
}
public void setAccount_list(ArrayList<Account> account_list) {
	Account_list = account_list;
}
public HashMap getSorage_frug() {
	return Sorage_frug;
}
public void setSorage_frug(HashMap sorage_frug) {
	Sorage_frug = sorage_frug;
}
}
