In my opinion, it is time to apply the "HTTPS for Everything Policy" to development environments too. This template is my way to  show my humble support to that.

In few words, this template is a multimodule Spring Boot project comprised of a https server and a http client (it could be transformed in a https client easily, though). The https server expose a REST operation whereas the client shows its output in a html file. Nowadays, this is a pretty common scenario.

In a local development environment, you rarely have the chance to use a valid CA certificate to set up the https server, normally you have to deal with a self-signed certificate instead, and this works fine. However, when another project or some other developer try to call your REST operation via back-end, the ugly *javax.net.ssl.SSLHandshakeException* will appear. Using this template you can reproduce the scenario as well as provide a solution to your coworkers quickly. 

Remember, use this template **only on development environments**.

You can find a post about at https://blog.immontilla.eu/spring-boot-https-server-client-templates
