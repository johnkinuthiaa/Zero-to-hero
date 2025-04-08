class Car:
    wheels = 4
    color = "black"
    model = "TTRS"
    def __init__(self):
        pass
    def __init(self, wheels, color, model):
        self.wheels = wheels
        self.color = color
        self.model = model

    def drive(self):
        print(self.model, "is driving away....")


car = Car()
car.drive()
