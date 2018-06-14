Fabrikmethode (Factory methode)
====
Das Factory Method Entwurfsmuster dient der Entkopplung des Client von der konkreten Instanziierung einer Klasse. Das erstellte Objekt kann elegant ausgetauscht werden. Oft wird es zur Trennung von (zentraler) Objektverarbeitung und (individueller) Objektherstellung verwendet. 

```
List<...> l = new List<String>;

//Hier ist die Liste auf ein String limitiert

//In der factory-methode versucht man irgendeine Liste zu laden kein spezifische.

List<...> l = listFactory.getList();
```

Beispiel:
- Zeichenprogramm: je nach dem welches Zeichenwerkzeug ausgewählt wurde zeichnet man entweder einen Kreis oder ein Rechteck ...


Fabrikmethode als UML

<img src="https://github.com/Mozartuss/Software-Engineering-II/blob/master/Bilder/Fabrikmethode.png" alt="FabrikmethodeKlassendiagram" width="500">

## Vergleich von Abstract Factory und Factory Method

***Gemeinsamkeit:*** Beide Pattern entkoppelt den Client von konkreten Typen. Der Client kennt nur die Schnittstelle zur Factory und den Produkten. Welche Produkte konkret erstellt werden, entscheidet die Unterklasse/Implementierung der Schnittstelle. Der Client stützt sich allein auf Abstraktion. 

    Abstract factory :
    Ganze Produktfamilie wird erstellt
    Die Schnittstelle ist meist du ein Interface und enthält kein Implementierungscode

    Factory method :
    Ein Produkt(typ) wird erstellt
    Schnittstelle oft abstrackt und enthält Code den alle Produkte durchlaufen müssen







   
    













