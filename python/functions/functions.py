# functions are blocks of code that run only when they are called and they persorm specific tasks
# functions are declared using the def keyword

def greet():
    print("hello there...welcome to zero to hero")

# for the function to run,we need to call
greet()

# the above function is general...if we need to add a personalized message based on the users name we use arguments

def greet_with_argument(name):
    print(f"hello {name}..welcome to zero to hero")

# we have to pass an argument to the function call for it to work

greet_with_argument(input("What is your name: "))

# we have two types of functions 1. performs calculations and prints value 2. perform a task and returns a value

# returning a value

def calculate_total_mass(mass):
    total=0
    for i in mass:
        total+=i
    return total
    
# the return value should consumed
print(calculate_total_mass([10,20]))

