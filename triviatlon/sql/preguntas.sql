Create table preguntas (
    idPregunta Integer not null auto_increment,
    categoria char(60) not null,
    pregunta char(100) not null,
    respuesta char(60) not null,
    falsarespuesta1 char(60) not null,
    falsarespuesta2	char(60) not null,
    falsarespuesta3 char(60) not null,
    primary key(idPregunta)
);


INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 1","¿Cuál es el rio más largo del mundo?", "Amazonas", "Nilo", "Yangtsé", "Río Amarillo o Huang He");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 1","¿Cómo se llama la reina del reino unido?", "Isabel Segunda", "Juana de Trastámara", "Isabel Clara Eugenia", "Guillermina de Prusia");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 1","¿En qué continente está ecuador?", "America","Asia","Oseania","África");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 1","¿Qué tipo de animal es la ballena?", "Mamifero","Insecto","Pez","Reptil");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 1","¿Que son los humanos?", "Omnivoros","Hervivoros","Carnivoros","Ninguna de las anteriores");

INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 2","¿Quien escribió la Odisea?", "Homero", "Fiodor Dostoyevski", "León Toistól", "lord Byron");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 2","¿Que colores tiene la bandera de Mexico?", "Verde Blanco y Rojo","Verde y Blanco","Amarillo, Azul y Rojo","Blanco y azul");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 2","¿Que cantidad de huesos tiene el cuerpo humano adulto?", 206, 300,250,365);
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 2","¿Quien es el autor del Quijote?", "Miguel de Cervantes","Oscar Wilde","Paulo Coelho","Julio Cortazar");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 2","¿Cómo se denomina el resultado de la multiplicación?", "Producto","Residuo","Diferencia de los numeros","resultado");

INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 3","¿En qué país se encuentra la torre pisa?", "Italia","Argentina","Austria","Suiza");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 3","¿Cuál es el lugar más frio del planeta?", "Antartida","Rusia","Estonia","Islandia");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 3","¿Cómo se llama la capital de mongolia?", "Ulan Bator","Moscú","Argel","Saint John");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 3","¿Cuándo se acabó la segunta guerra mundial?", 1945, 1850, 1710, 1540);
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 3","¿En qué año llengó Cristobal Colón a America?", 1492,1250,1600,1497);

INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 4","¿Quién es el padre del Psicoanálisis?", "Sigmun Freud", "Lev Vygotsky", "Jean Piaget", "William James");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 4","¿Qué producto cultiva más Guatemala?", "Banano","Azucar", "Bebidas, liquidos alcohólicos y vinagres","Frutas frescas secas o congeadas");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 4","¿Qué lugar del cuerpo produce la Insulina?", "Pancreas","Lengua","Cerebro","Timo");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 4","¿Con qué se fabrica el pergamino?", "Piel de Animales","Pasto","Arboles","Pajaros");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 4","¿Cuál fué el primer metal que empleó el hombre?", "El Cobre","Oro","Plata", "Hierro");

INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 5","¿Cómo se llama la estación espacial Rusa?", "MIR","Estación Espacial Internacional","Tiangong 1","Salyut 5");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 5","¿Cómo se llama una colección de revistas diarios y publicaciónes periódicas?", "Hemeroteca","Organización","Almacenar","Ninguna de las anteriores");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 5","¿Qué era el Concorde?", "Avión super sónico para viajeros","Yate de lujo", "Submarino para una persona", "Una moto");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 5","¿Cuál es la capital de Croacia?", "Zagreb","Gaborone","Uagadugú","Copenhague");
INSERT into preguntas(categoria, pregunta, respuesta, falsarespuesta1, falsarespuesta2, falsarespuesta3) VALUES ("Nivel 5","¿Cual es el metal más caro del mundo?", "Rodio","Oro","Estaño","Niquel");




