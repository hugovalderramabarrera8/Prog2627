# Ejercicio 12

edad = int(input("¿Cuántos años tienes? "))

respuesta = input("¿Eres estudiante? (si/no): ")
estudiante = respuesta == "si"

compra = float(input("¿Cuánto has gastado? "))

descuento = (edad > 65) or (estudiante and compra > 50)

print(descuento)
