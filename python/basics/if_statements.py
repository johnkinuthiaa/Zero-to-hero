# used to check for conditions and executes if the condition is met
from variables import is_raining

if is_raining:
    print("carry and umbrella")
else:
    print("Apply sunscreen")

# blood donation a person below 50kgs is considered as underweight and cannot donate blood
body_weight = float(input("Enter your body weight in kgs: "))

if body_weight <= 50:
    print("You are underweight and cannot donate blood")
else:
    print("you can proceed to blood donation!")

# grading system
students_marks =int(input("Enter your marks: "))
if students_marks<30:
    print("Score :E")
elif students_marks<=39:
    print("score: D")
elif students_marks<=49:
    print("score: C")
elif students_marks<=59:
    print("Score: B")
elif students_marks<=69:
    print("Score: B+")
elif students_marks<=100:
    print("score A")
elif students_marks>100:
    print("invalid marks")
