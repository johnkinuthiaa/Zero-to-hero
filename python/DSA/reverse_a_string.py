# Reversing a String
# Write a Python function that takes a string as input and returns the reversed version of the string.


def reverse_string(s):
    return s[::-1]

# Test the function
# Ask the user for input

input_string = input("Enter a string to reverse: ")
output = reverse_string(input_string)
print("Reversed String:", output)