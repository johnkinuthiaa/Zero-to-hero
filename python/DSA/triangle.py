# Given an integer n, print a right angled triangle of height n
# where the triangle is made up of the character A

def triangle(n):
    # Print the text
    print(f"Right-angled triangle with height {n}:")
    
    # Print the triangle
    for i in range(1, n+1):
        print("A" * i)

# Get input from user
try:
    height = int(input("Enter the height of the triangle (n): "))
    if height <= 0:
        print("Please enter a positive integer.")
    else:
        triangle(height)
except ValueError:
    print("Invalid input. Please enter a positive integer.")

