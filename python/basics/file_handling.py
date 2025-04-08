with open("names_list.txt","r") as file:
    content =file.read().split(",")
    for i in content:
        i =i.strip()
        with open(f"invitation_for_{i}.txt","w") as invitation:
            invitation.write(f"""Hello ,{i}\n, you are cordially invited to my birthday on date 5""")
    file.close()
