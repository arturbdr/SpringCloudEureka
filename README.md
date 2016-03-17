# SpringCloudEureka
Nesse repositório estão contidos 4 projetos do tipo SpringCloud:

- SpringCloudEurekaServer
- SpringCloudEurekaClient-Adjetivo
- SpringCloudEurekaClient-Pronome
- SpringCloudEurekaClient-Sentenca
 
--

- SpringCloudEurekaServer

É o projeto responsável por subir o servidor Eureka. Esse servidor é responsável por realizar o cadastramento dos serviços de cada um dos clientes. Ao executar esse projeto como um projeto SpringCloud, serão expostos serviços cuja responsabilidade é receber as meta informações dos clientes (registra-los) e serviços para recuperação dos clientes registrados (service discovery).
Esse é a primeira aplação a ser inicializada antes dos clientes.

- SpringCloudEurekaClient-Adjetivo
 
Representa um dos clientes. Esse projeto está configurador como um Eureka cliente e, portanto, no momento em que subir esse servidor ele tentará se registrar no Eureka-Server (projeto descrito acima). Ele sobe em uma porta randômica e expõe um serviço RESTful /palavra
Esse serviço RESTful retorna apenas uma String contendo um Adjetivo

- SpringCloudEurekaClient-Pronome
 
Representa um dos clientes. Esse projeto está configurador como um Eureka cliente e, portanto, no momento em que subir esse servidor ele tentará se registrar no Eureka-Server (projeto descrito acima). Ele sobe em uma porta randômica e expõe um serviço RESTful /palavra
Esse serviço RESTful retorna apenas uma String contendo um Pronome

- SpringCloudEurekaClient-Sentenca
 
Esse projeto é um exemplo do uso do Eureka-Server para recuperar as informaçoes necessárias para consumo do serviço nos clientes. Ele faz o consumo do cliente de Pronome em seguida faz o consumo do cliente de Adjetivo sobe em uma porta randômica e expõe um serviço RESTful /palavra
Esse serviço RESTful retorna uma String contendo um Pronome e um Adjetivo recuperados respectivamentes dos clientes acima.
A URL utilizada para o consumo dos clients foi obtida a partir do servidor do Eureka.
