package com.ravindra.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ravindra.data.UserData;

@Service
public class UserService {

	private List<UserData> usersData = new ArrayList<>();
	
	public void createService(UserData userData) {
		usersData.add(userData);
	}

	public UserData findByUserName(String userName) {//chandra user is exist in this list
		UserData usrData = null;
//		for(UserData userData : usersData)
//		{
//			if(userData.getUserName().equals(userName))
//			{
//				usrData = userData;
//				break;
//			}
//		}
		Optional<UserData> userDtOptional = usersData.stream().filter(userData->userData.getUserName().equals(userName)).findAny();
		if(userDtOptional.isPresent())
		{
			usrData = userDtOptional.get();
		}
		return usrData;
	}

}