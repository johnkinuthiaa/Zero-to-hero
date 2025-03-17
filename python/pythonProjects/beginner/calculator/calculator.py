print("------python calculator--------")

num1 =int(input("Enter the first number: \n"))
num2 =int(input("Enter the second number: \n"))
operation =input("Enter the operation to perform "
                 "\n + for addition"
                 "\n - for subtraction "
                 "\n / for division and"
                 "\n * for multiplication '\n: ")

def perform_operation(first_number,second_number,operator):
    match operator:
        case "+":
            print(f"the sum of {first_number} and {second_number} is {first_number+second_number}")
        case "-" :
            print(f"the difference of {first_number} and {second_number} is {first_number - second_number}")
        case "*":
            print(f"the product of {first_number} and {second_number} is {first_number * second_number}")
        case "/":
            if first_number==0 or second_number==0:
                print("Cannot divide a number by 0")
            else:
                print(f"the quotient of {first_number} and {second_number} is {first_number / second_number}")
        case _:
            print("Invalid operation! please try again !")

perform_operation(num1,num2,operation)