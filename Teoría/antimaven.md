# Teoría Ant i Maven
Quan el codi creix es te que compilar els fitxers un a un.
Es creen determiants scrips que compilan per a facilitar y automatizar tasques.

## Ús de ant:
Tenim que crear un fitxer build.xml que esprcifiquem com es compilará el projecte.
Per exemple:
```
<project name="saludaAnt">
    <target name="clean">
        <delete dir="build" />
    </target>

    <target name="compile" depends="clean">
        <mkdir dir="build" />
        <javac includeantruntime="false" 
        srcdir="src/com/ieseljust/edd" destdir="build" />
    </target>

    <target name="run" depends="compile">
        <property name="arg0" value=""/>
        <java classpath="build" classname="com.ieseljust.edd.Hola">
            <arg value="${arg0}"/>
        </java>
    </target>
</projec
```
```
$ tree
.
├── build
│   └── com
│       └── ieseljust
│           └── edd
│               ├── Calcula.class
│               └── Calculadora.class
├── build.xml
└── src
    └── com
        └── ieseljust
            └── edd
                ├── Calculadora.java
                └── Calcula.java
```
## Ús de maven:
La idea de fer un proyecte amb Maven és oferir suport al cicle de vida de construcció segons estàndards, de manera que les
nostres aplicacions siguen més homogènies i tinguen en compte bones pràctiques.

### Cicles:
Maven distingix tres cicles de vida en el procés de construcció:

Default: El cicle de vida per defecte que gestiona la construcció en si de la solució,
Clean: El cicle de vida que s'encarrega de la neteja del projecte,
Site: El cicle de vida per a la generació de documentació.

Cadascuna d'elles es realitzen diferents accions.

### El POM:
El Model d'Objectes del Projecte (Project Object Model, POM) és un fitxer XML que descriu la configuració del projecte en Maven,

Els valors per defecte del **Super POM** es combinaran amb els valors definits en el fitxer en l'arrel del projecte pom.xml per a 
obtindre el que es coneix com el **POM efectiu**, que és el que s'aplicarà al projecte en qüestió.

### Creació del projecte
Hem d'utilitzar el mecanisme d'arquetips que ens oferix.

Ens coloquem en la carpeta y posem:
```
$ mvn archetype:generate -DgroupId=com.ana.edd -DartifactId=CalcMaven -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
```
#### Compilar i ejecutar:
En el arrel del arxiu:
```
$ mvn compile
```

```
$ java -cp target/classes com.ana.edd.Calcula^C
```
```
$ mvn clean
```
