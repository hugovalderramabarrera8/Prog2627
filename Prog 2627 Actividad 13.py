# 1. Pedimos los datos al usuario
cliente = input("Introduce el nombre del cliente: ")
producto = input("Introduce el nombre del producto: ")
precio_unitario = float(input("Introduce el precio unitario (€): "))
cantidad = int(input("Introduce la cantidad comprada: "))
porcentaje_iva = float(input("Introduce el porcentaje de IVA: "))
incluye_propina = input("¿Desea incluir propina opcional de 2€? (si/no): ")

# 2. Hacemos los cálculos
subtotal = precio_unitario * cantidad
monto_iva = subtotal * porcentaje_iva / 100

# Truco básico sin 'if': si escribe "si" vale True (1), si no vale False (0)
propina = (incluye_propina == "si") * 2.0

total_final = subtotal + monto_iva + propina

# Comprobamos si supera los 30€ (da True o False)
es_cliente_vip = total_final > 30

# 3. Mostramos el tique por pantalla
print("=========================================")
print("          TIQUE DE CAFETERÍA")
print("=========================================")
print("Cliente:", cliente)
print("Producto:", producto, "x", cantidad)
print("-----------------------------------------")
print("Subtotal:", subtotal, "€")
print("IVA (21%):", monto_iva, "€")
print("Propina:", propina, "€")
print("TOTAL A PAGAR:", total_final, "€")
print("-----------------------------------------")
print("¿Supera el umbral VIP (>30€)?:", es_cliente_vip)
print("=========================================")
