class Login:
    def __init__(self):
        self.user_list =["chan","c"]
        self.user_data=[["chan","Chan@13","chan123@gmail.com","pudukkotai","Chan@13"],["c","Chan@12","chan@gmail.com","chennai","Chan@12"]]
   
    def loginPage(self):
        import validate
        global user_login_name,user_login_password
        print("\t\t-----------LOGIN-----------") 
        flag = True
        while flag:  
            user_login_name = input("UserName: ")
            user_login_password = input("Password: ")  
            if(user_login_name in self.user_list):
                True
                for data in self.user_data:   
                    if(((user_login_name in data) and (user_login_password in data))):
                        print("Login Successfully")
                        flag = False            
                    else:
                        True    
            elif((user_login_name in validate.data) and (user_login_password in validate.data)):
                print("Login Successfully")
                flag = False
            else:
                print("Invalid Input")
                flag=True
        from home_page import Home
        h=Home()
        h.homePage()

log = Login()
#log.loginPage()