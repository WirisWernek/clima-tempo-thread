package com.wernek.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ObjectUtils {

	public static boolean isNullOrEmpty( Object obj ) {
		if( obj == null ) {
			return true;
		} else if( obj instanceof String && ( ( String ) obj ).trim().isEmpty() ) {
			return true;
		} else if( obj instanceof List && ( ( List ) obj ).isEmpty() ) {
			return true;
		}
		return false;
	}
}
