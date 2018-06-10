## Zustandsdiagramm

1. Führen Sie auf dem unten stehenden Zustandsdiagramm die folgenden Ereignisse aus:
    e1,e4,e1,e4. Notieren Sie hierbei in der Tabelle die Werte von x und y und halten Sie alle ausgeführten Aktivitäten fest.
    Begründen Sie genau, wieso welche Kante in welchen Situationen ausgewählt wird.
 
 2. Finden Sie eine Abfolge von Ereignissen, mit deren Hilfe sich der Zustandsautomat,
    ausgehend von dem Zustand A\X1 und x = 12,y = 12, in den Zustand B begibt.
    Dokumentieren Sie wie in der ersten Teilaufgabe die Werte von x und y sowie die Aktivitäten,
    um zu belegen dass der Automat sich durch Ausführung Ihre Abfolge in den Zustand B begibt. 
    Welche Werte haben x und y in Zustand B?
    
![Zustandsdiagramm](/Bilder/Zustandsdiagramm.PNG)

| Event | Zusatand | x | y | Aktivität | Grund   | 
|-------|----------|---|---|-----------|-------  |
|START  |          |0  |0  |x = y = 0  |Kante    |
|       |          |1  |0  |x = x + 1  |E A      |
|       |          |2  |0  |x = x * 2  |Kante    |
|       |A/X1      |4  |0  |x = x + 2  |E X1     |
|e1     |          |4  |4  |y = y + x  |E X1     |
|e4     |          |4  |4  |           |[ x = y ]|
|       |A/X3      |3  |4  |x = x - 1  |E X3     |
|       |          |6  |4  |x = x * 2  |Kante    |
|       |A/X1      |8  |4  |x =x + 2   |E X1     |
|e1     |          |8  |12 |y = y + x  |E X1     |
|e4     |A/X2      |16 |12 |x = x * 2  |Kante    |
|       |          |32 |12 |x = x * 2  |Kante    |  





