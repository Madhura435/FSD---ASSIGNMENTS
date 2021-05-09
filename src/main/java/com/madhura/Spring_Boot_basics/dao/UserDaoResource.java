package com.madhura.Spring_Boot_basics.dao;

import org.springframework.stereotype.Component;

import com.madhura.Spring_Boot_basics.entities.User;

import java.util.*;

@Component
public class UserDaoResource {
	
	private int userCount=4;
private static List<User> t=new ArrayList<User>();
static
{
	t.add(new User(1,"mark",new Date()));
	t.add(new User(2,"john",new Date()));
	t.add(new User(3,"paul",new Date()));
	t.add(new User(4,"madhura",new Date()));
	t.add(new User(5,"priya",new Date()));
}
public List<User> findAll()
{
	return t;
}

public User findOne(Integer fid)
{
	for(User u:t)
	{
		if(u.getId()==fid)
		{
			return u;
		}
	}
	return null;
}

public void save(User p)
{
	if(p.getId()==null)
	{
		p.setId(++userCount);
	}
	t.add(p);
}

public boolean delete(int id)
{
	User y=findOne(id);
	if(y!=null)
	{
		t.remove(y);
		return true;
	}
	else
	{
		return false;
	}
}
public boolean update(int id,User updateUser)
{
	User y=findOne(id);
	if(y!=null)
	{
		t.set(id-1,updateUser);
		return true;
	}
	else
	{
		return false;
	}
}
}
