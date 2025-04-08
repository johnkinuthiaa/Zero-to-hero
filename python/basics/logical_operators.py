is_customer =False
age =71
price =800

if is_customer | age>=70:
    discount =0.5*price
    price =price-discount
    print(f"You will pay ksh.{price}")
else:
    print(f"You will pay ksh.{price}")