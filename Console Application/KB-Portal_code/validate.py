import re
class Validate:   
    def userRegister(self):
        global data
        data=[]
        from login import log
        print("----------REGISTER-------------")    
        flag = True
        while(flag):
            new_user_name = input("Name: ")
            if(new_user_name in log.user_list):
                print("User name already exist")
                flag=True
            else:
                data.append(new_user_name)
                flag=False
        flag1 = True
        while(flag1):
             print("password should contains 1-uppercase,1-lowercase,1-special symbol")
             new_user_password = input("password: ")
             if re.match(r'[A-Z][a-z0-9@#$!%^&*]{6,12}', new_user_password):
                data.append(new_user_password)
                length=len(new_user_password)
                if(length<7):
                    print("weak password")
                else:
                    print("strong password")
                flag1 = False
             else:
                print("Invalid password")
        flag2=True
        while(flag2):
            new_user_emailid = input("Email_Id: ")
            if re.match(r'^[a-z0-9]+[\._]?[a-z0-9]+[@]\w+[.]\w{2,3}$', new_user_emailid):
                data.append(new_user_emailid)
                flag2 = False
            else:
                print("Invalid email")
        new_user_city = input("City/Town: ") 
        data.append(new_user_city)
        new_user_confirmpassword = input("Confirm Password: ")
        data.append(new_user_confirmpassword)
        print("\n")

        if(new_user_password != new_user_confirmpassword):
            print("Incorrect password")
            flag = True
        else:
            print("Register Successfully...")
            log.loginPage()
            
val = Validate()
#val.userRegister()


