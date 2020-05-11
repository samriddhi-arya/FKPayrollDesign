package user;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONController {

	@SuppressWarnings("unchecked")
	public static void add(HourlyEmployee emp) {
		JSONParser jsonParser = new JSONParser();
        
        try {
        	FileReader readfile = new FileReader("hourlyEmployeeData.json");
        	JSONArray jsonArray = null;
//        	if(readfile.toString().isEmpty()) {
//       		jsonArray = new JSONArray();
//        	}
//        	else {
        		Object obj = jsonParser.parse(readfile);
        		jsonArray = (JSONArray)obj;
//        	}
        	
            System.out.println(jsonArray);

            JSONObject employee = new JSONObject();
            employee.put("Name",emp.getName());
            employee.put("Contact number",emp.getContact());
            employee.put("Account Summary",emp.getAccountSummary());
            employee.put("HourlyWages",emp.getHourlyRate());
            employee.put("Time Card",emp.getTimeCard());

            JSONObject employeeObject = new JSONObject();
            employeeObject.put(emp.getID(),employee);

            jsonArray.add(employeeObject);

            System.out.println(jsonArray);

            FileWriter file = new FileWriter("hourlyEmployeeData.json");
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
	}

	@SuppressWarnings("unchecked")
	public static void add(SalariedEmployee emp) {
		JSONParser jsonParser = new JSONParser();
        
        try {
        	FileReader readfile = new FileReader("salaryEmployeeData.json");
        	JSONArray jsonArray = null;
//        	if(readfile.toString().isEmpty()) {
//        		jsonArray = new JSONArray();
//        	}
//        	else {
        		Object obj = jsonParser.parse(readfile);
        		jsonArray = (JSONArray)obj;
//        	}
        	
            System.out.println(jsonArray);

            JSONObject employee = new JSONObject();
            employee.put("Name",emp.getName());
            employee.put("Contact number",emp.getContact());
            employee.put("Account Summary",emp.getAccountSummary());
            employee.put("Monthly Salary",emp.getMonthlySalary());
            employee.put("Commission Rate",emp.getCommisionRate());
            

            JSONObject employeeObject = new JSONObject();
            employeeObject.put(emp.getID(),employee);

            jsonArray.add(employeeObject);

            System.out.println(jsonArray);

            FileWriter file = new FileWriter("salaryEmployeeData.json");
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
	}
	
	@SuppressWarnings("unchecked")
	public static void addTimeCard() {
		try {
			FileReader readfile = new FileReader("hourlyEmployeeData.json");
			JSONArray jsonArray = null;
        	Object obj = jsonParser.parse(readfile);
            jsonArray = (JSONArray)obj;
        	
            System.out.println(jsonArray);
          
            Iterator<JSONObject> iterator = jsonArray.iterator();
            
            
		}
		catch(IOException e) {
			
		}
	}
}
