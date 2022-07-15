
def shipCost(c:Double,y:Double):Double=3+(c-50)*y

def totalPrice(p:Double,c:Double):Double=p*c

def wholeSaleCost(p:Double,c:Double,d:Double,y:Double):Double=(totalPrice(p,c)-shipCost(c,y))/(1+d)

scala> wholeSaleCost(24.95,60,0.4,0.75)
val res11: Double = 1061.7857142857144
