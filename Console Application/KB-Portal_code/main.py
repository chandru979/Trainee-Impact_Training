'''
Title: Knowledge Base Learning Portal
Author: Chandrasekaran R
Created on: Feb 7,2023
Last Modified Date: Feb 21,2023
Reviewed by:
Reviewed on:
'''
class Main:
    def choose(self):
        print("\t\t------KNOWLEDGE BASE - LEARNING PORTAL-------\n")
        print("1.REGISTER \n2.USER LOGIN")
        choice = int(input("\nEnter your choice: "))
        if(choice == 1):
            from validate import Validate
            val=Validate()
            val.userRegister()
        elif(choice == 2):
            from login import Login
            log = Login()
            log.loginPage()

m = Main()
m.choose()