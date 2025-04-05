# Were going to reverse a string using recursion
def reverseString(s):

# If the lenth is 0(empty). Return the string
    if len(s) == 0:
     return s
    

    return reverseString(s[1:]) +s[0]

input_string = input("Enter a string to reverse: ")
output = reverseString(input_string)
print("Reversed string:", output)