FROM nginx:alpine
# Copia tu archivo HTML a la carpeta donde Nginx sirve los sitios
COPY index.html /usr/share/nginx/html/index.html
