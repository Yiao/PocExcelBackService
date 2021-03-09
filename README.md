# PocExcelBackService
This is a back service spring boot https

1. You need install docker in your computer:
https://docs.docker.com/docker-for-windows/install/

2. You need install docker-compose
https://docs.docker.com/compose/install/

3. You need add this [certificat](https://github.com/Yiao/PocExcelBackService/blob/main/certs/nginx-selfsigned.crt) in your computer

https://support.globalsign.com/ssl/ssl-certificates-installation/import-and-export-certificate-microsoft-windows 

4. Run Back Service with commande :
```
docker-compose -f docker-compose.yaml up
```

5. The projet back service spring boot is in [/app](https://github.com/Yiao/PocExcelBackService/tree/main/app)

6. The certificate ssl is in [/certs](https://github.com/Yiao/PocExcelBackService/tree/main/certs)

7. The configuration nginx is in [/nginx](https://github.com/Yiao/PocExcelBackService/tree/main/nginx/conf.d)

We can use two urls of this back service https

https://localhost:443/api/hello

https://localhost:443/api/addFive
