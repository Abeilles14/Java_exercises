#isabelle andre
#14-07/18
#if challenge

name = input("Enter your name: ")
age = int(input("Enter your age: "))

#if age >= 18 and age <= 30:
if 18 >= age <= 30:
    print("Welcome to the 18-30 holiday, {}".format(name))
else:
    print ("You are not eligible to enter the holiday")