import login
import validate
from login import log
class Detail():
    def myProfile(self):
        print("------MYPROFILE-----------") 
        login_name = login.user_login_name
        login_psswd = login.user_login_password
        if(login_name in log.user_list):
            True
            for data in log.user_data:     
                if(login_name in data and login_psswd in data):
                    print("Email Id: ",data[2])
                    print("Name: ",login_name)
                    print("City: ",data[3])
                    print("Password: ",login_psswd)
                else:
                    True
        elif(login_name in validate.data and login_psswd in validate.data):
            print("Email Id: ",validate.data[2])
            print("Name: ",login_name)
            print("City: ",validate.data[3])
            print("Password: ",login_psswd)
        
        print("1.Home\t2.MyCourses\t3.Logout")
        choice = int(input("\nEnter your choice: "))
        if(choice==1):
            from home_page import Home
            h=Home()
            h.homePage()
        elif(choice==2):
            from Mycourse import Courses
            course=Courses()
            course.myCourses()
        elif(choice==3):
            from logout import Logout
            lo = Logout()
            lo.logOut()  
        else:
            print("Invalid number")
det = Detail()
#det.myprofile()