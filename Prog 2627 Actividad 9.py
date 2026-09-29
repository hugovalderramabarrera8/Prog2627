# Ejercico 9
nombre = input("¿Cómo te llamas? ")
anio = int(input("¿En qué año naciste? "))
altura = float(input("¿Cuánto mides en metros? "))

edad = 2026 - anio

print("--- FICHA REGISTRADA ---")
print("Nombre:", nombre, "Tipo:", type(nombre))
print("Edad:", edad,"años", "Tipo:", type(anio))
print("Altura:", altura, "metros.", "Tipo:", type(altura))
