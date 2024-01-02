Crear Base Datos

CREATE TABLE `telefono` (
`precio` double DEFAULT NULL,
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`clave` varchar(255) DEFAULT NULL,
`descripcion` varchar(255) DEFAULT NULL,
`marca` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`),
UNIQUE KEY `UK_ff8x78xdekso96wf5wgo55ilm` (`clave`)
)

INSERTS:

INSERT INTO telefono (clave, descripcion, marca, precio) values ('s4abc', 'Samsung snap dragon',  'Samsung',  20000);
INSERT INTO telefono (clave, descripcion, marca, precio) values ('x4def', 'Moto g',               'Motorola', 4555);
INSERT INTO telefono (clave, descripcion, marca, precio) values ('Ighi', 'Iphone 30',             'IPhone',   67000);
INSERT INTO telefono (clave, descripcion, marca, precio) values ('AlcatelOxxo', 'Alcatel Red 2g', 'Alcatel',  1500);



// obtener todos los datos
http://localhost:8089/telefono/findAll

// Guardar
http://localhost:8089/telefono/save
{
"clave": "hua123",
"descripcion": "huawei Core exiynos",
"marca": "huawei",
"precio": 12000.0
}





