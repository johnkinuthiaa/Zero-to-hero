# use double quotes to define strings

my_name ="king kade my king!"

# user ''' ''' to define multiline strings

email_content =f'''
Hello {my_name},
how are you doing!
This is our onboarding email
'''
# print(email_content)

# string manipulation
# substrings
# [from,to but not including]
# access first value
print(my_name[0])
# access last value
print(my_name[0:7])

her_name = "jennifer angie me waao"
print(her_name)
header ="  Bearer eydhukjhgefdjte"
#
# print(len(her_name))

# string methods
#
print(her_name.title())
print(her_name.upper())
print(her_name.lower())
print(her_name.strip(" "))
print(her_name.endswith("o"))
new_header=header.strip(" ")
if new_header.startswith("Bearer"):
    token =new_header[7:]
    print(token)
print(her_name.replace(" ",","))

# search a string for an existing value
print("angie" in her_name)

