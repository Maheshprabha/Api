package com.atmecs.testdata;

import com.atmecs.filepath.Filepaths;
import com.atmecs.utils.PropReader;

public class UsersDataProvider {
	public static Object[][] getUserData(){
		PropReader userDataReader = new PropReader(Filepaths.USERS_DATA_PROP_FILE);
		String url = userDataReader.get("url");
		String firstName = userDataReader.get("firstName");
		String secondName = userDataReader.get("secondName");
      Object[][] data = new Object[1][3];
      data[0][1] = url;
      data[0][2] =firstName;
      data[0][3] =secondName;
	return data;
	}

}
