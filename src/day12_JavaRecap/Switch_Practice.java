package day12_JavaRecap;

public class Switch_Practice {

    public static void main(String[] args) {

        switch(3){

            default:
                System.out.println("Invalid Case");
                break;

            case 1:
                System.out.println("Case 1");
                break;    // exits switch statement

            case 2:
                System.out.println("Case 2");
                break;
        }

        System.out.println("===================================================");

      /*
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
 */

        int statusCode =800;
        String result = "";
        switch(statusCode){

            case 200:
                //  System.out.println("Ok");
                result = "Ok";
                break;

            case 201:
                //   System.out.println("Created");
                result = "Created";
                break;

            case 202:
                //   System.out.println("Accepted");
                result = "Accepted";
                break;

            default:
                //  System.out.println("Invalid Status Code");
                result = "Invalid Status Code";
        }

        System.out.println(result);




    }


}