# Abstract factory 

Das Abstract Factory Design Pattern dient der Definition einer zusammenhängenden Familie aus Produkten. Die Familien können elegant ausgetauscht werden. 

### Beispiel

```
interface AbstractGenerator{
    public Tier createTier();
    public Pflanze createPflanze();
    public Untergrund createUntergrund();
}

class Regenwaldgenerator implements AbstractGenerator{
    public Tier createTier(){
        return new Elefant();
    }
    public Pflanze createPflanze(){
        return new Baum();
    }
    public Untergrund createUntergrund(){
        return new Gras();
    }
}
class Wüstengenerator implements AbstractGenerator{
    public Tier createTier(){
        return new Kamel();
    }
    public Pflanze createPflanze(){
        return new Kaktus();
    }
    public Untergrund createUntergrund(){
        return new Sand();
    }
}
class Polargebietgenerator implements AbstractGenerator{
    public Tier createTier(){
        return new Eisbär();
    }
    public Pflanze createPflanze(){
        return new Flechte();
    }
    public Untergrund createUntergrund(){
        return new Schnee();
    }
}	
```

```
//Interface
interface Tier{}
interface Pflanze{}
interface Untergrund{}

//Regenwald
class Elefant implements Tier{}
class Baum implements Pflanze{}
class Gras implements Untergrund{}

//Wüste
class Kamel implements Tier{}
class Kaktus implements Pflanze{}
class Sand implements Untergrund{}

//Polargebiet
class Eisbär implements Tier{}
class Flechte implements Pflanze{}
class Schnee implements Untergrund{}
```

Welches konkrete Spielweltobjekt nun wirklich zurückgeliefert wird, entscheidet allein die Implementierung. 

So kann nun der Anwender einen allgemeingültigen Spielwelt code schreiben.

```
public static void main(String[] args) {
    //An einer zentrale Stelle wird der Typ bestimmt -> schneller Austausch
    AbstractGenerator generator = new Polargebietgenerator();
    
    //Objekte werden erstellt 
    Pflanze pflanze = generator.createPflanze();
    Tier tier = generator.createTier();
    Untergrund untergrund = generator.createUntergrund();
    //...
    
    //Welt wird gebaut
}	
```

Hier entscheidet sich der Anwender ein Polargebiet zu zu generieren.
Durch `generator.createPflanze` werden nur die richtigen Pflanzen erstellt, die auch in dem jeweiligen Gebiet vorkommen.

Durch die abstract factory ist die Spielwelt sehr <u>_flexibel_</u> und <u>_allgemeingültig_</u>.
Dies ist einer der großen vorteile bei der abstract factory.
Auch die <u>_Erweiterbarkeit_</u> ist ein großer Pluspunkt der abstract factory. So könnte hier zum Beispiel noch ein Bayrisches Alpenvorland generiert werden.
Es müsste nur noch der AbstractGenerator in der neuen Klasse Implementiert werden, der wiederum alle nötigen interfaces realisiert.








