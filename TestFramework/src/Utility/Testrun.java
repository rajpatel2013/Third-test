package Utility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public class Testrun {

	public static void main(String[] args) throws FileNotFoundException, ParseException, JSONException, IOException {
		
		System.out.println("arg1 : " + args[0]);
		ReadJsonData.getDataFromJsonFileForCommonTestEnv(args[0]);
		
		
           }

     }
