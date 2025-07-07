
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="css/styles.css">
    <title>Neighborhood Store - Tu tienda de barrio</title>
</head>
<body>
    <div class="main">
        <!-- Navbar -->
        <nav class="navbar">
                <a href="#" class="logo">
        <img src="images/ChatGPT Image 10 jun 2025, 04_20_10 p.m..png" alt="NEIGHBORHOOD STORE" class="logo-img">
    </a>
            <div class="nav-links">
                <span class="item selected" data-section="home">Inicio</span>
                <span class="item" data-section="services">Servicios</span>
                <span class="item" data-section="credits">Créditos</span>
                <span class="item" data-section="contact">Contacto</span>
            </div>
            <div class="nav-buttons" id="navMenu">
                <button class="nav-btn selected">INICIAR SESIÓN</button>
            </div>
            <button class="toggler">
                <i class='bx bx-menu'></i>
            </button>
        </nav>
        <!-- End of Navbar --> 
         
        <!-- Hero Section -->
        <section id="home" class="top-container section">
            <div class="info-box">
                <h1 class="header">
                    Tu tienda de confianza en el barrio
                </h1>
                <p class="info-text">
                    Más de 10 años ofreciendo los mejores productos con la mejor atención y facilidades de pago para nuestra comunidad.
                </p>
                <div class="info-buttons">
                    <button class="info-btn selected">Explorar</button>
                </div>
            </div>
            <div class="nft-box">
                <img src="images/image.jpg" alt="Tienda de barrio" class="nft-pic">
                <div class="nft-content">
                    <div class="store-badge">
                        <i class='bx bxs-star'></i>
                        <span>10+ años sirviendo</span>
                    </div>
                </div>
            </div>
        </section>

        <!-- Servicios Section -->
        <section id="services" class="get-started section">
            <h2 class="header">Nuestros Servicios</h2>
            <p class="info-text">Todo lo que necesitas, con la comodidad y confianza de siempre</p>
            <div class="items-box">
                <div class="item-container">
                    <div class="item">
                        <i class='bx bxs-shopping-bags'></i>
                    </div>
                    <p>Variedad de Productos</p>
                </div>
                <div class="item-container">
                    <div class="item">
                        <i class='bx bx-credit-card'></i>
                    </div>
                    <p>Sistema de Crédito</p>
                </div>
                <div class="item-container">
                    <div class="item">
                        <i class='bx bxs-truck'></i>
                    </div>
                    <p>Entrega a Domicilio</p>
                </div>
                <div class="item-container">
                    <div class="item">
                        <i class='bx bxs-discount'></i>
                    </div>
                    <p>Ofertas Semanales</p>
                </div>
            </div>
        </section>

        <!-- Creditos Section -->
        <section id="credits" class="get-started section">
            <h2 class="header">Nuestro Sistema de Crédito</h2>
            <p class="info-text">Facilidades de pago diseñadas para nuestra comunidad</p>
            <div class="items-box">
                <div class="item-container">
                    <div class="item">
                        <i class='bx bxs-user-check'></i>
                    </div>
                    <p>Créditos según tu historial</p>
                </div>
                <div class="item-container">
                    <div class="item">
                        <i class='bx bxs-calendar'></i>
                    </div>
                    <p>Plazos flexibles</p>
                </div>
                <div class="item-container">
                    <div class="item">
                        <i class='bx bxs-report'></i>
                    </div>
                    <p>Seguimiento de pagos</p>
                </div>
                <div class="item-container">
                    <div class="item">
                        <i class='bx bxs-credit-card'></i>
                    </div>
                    <p>Mejora tu categoría</p>
                </div>
            </div>
        </section>

        <!-- Contacto Section -->
        <section id="contact" class="contact-section">
            <h2 class="header">Visítanos</h2>
            <div class="contact-content">
                <div class="map-container">
                    <!-- Aquí iría un mapa o imagen de ubicación -->
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3976.675290921572!2d-74.06553702424235!3d4.65187569532297!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e3f9a45d9f1654b%3A0x3d69138572d157f2!2sSENA%20-%20Centro%20De%20Servicios%20Financieros!5e0!3m2!1ses!2sco!4v1749594215422!5m2!1ses!2sco" 
                    width="600" 
                    height="450"
                    style="border:0;"
                    allowfullscreen="" 
                    loading="lazy" 
                    referrerpolicy="no-referrer-when-downgrade"></iframe>
                </div>
                <div class="contact-info">
                    <h3>Información de contacto</h3>
                    <div class="contact-item">
                        <i class='bx bxs-map'></i>
                        <span>Kr 13 #6510, Bogotá</span>
                    </div>
                    <div class="contact-item">
                        <i class='bx bxs-phone'></i>
                        <span>+57 322 3883 258</span>
                    </div>
                    <div class="contact-item">
                        <i class='bx bxs-envelope'></i>
                        <span>contacto@neighborstore.com</span>
                    </div>
                </div>
            </div>
        </section>

        <!-- Footer -->
        <footer class="footer">
            <div class="footer-content">
                <div class="footer-about">
                    <img src="images/ChatGPT Image 10 jun 2025, 04_20_10 p.m..png" alt="NEIGHBORHOOD STORE" class="footer-logo">
                    <p>Tu tienda de confianza en el barrio por más de 10 años. Calidad, confianza y crédito responsable.</p>
                    <div class="social-icons">
                        <a href="#"><i class='bx bxl-facebook'></i></a>
                        <a href="#"><i class='bx bxl-instagram'></i></a>
                        <a href="#"><i class='bx bxl-whatsapp'></i></a>
                    </div>
                </div>
                <div class="footer-links">
                    <div class="link-group">
                        <h4>Horario</h4>
                        <p>Lunes a Viernes: 9am - 6pm</p>
                        <p>Sábados: 10am - 4pm</p>
                        <p>Domingos: Cerrado</p>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <p>&copy; 2025 Neighborhood Store. Todos los derechos reservados.</p>
            </div>
        </footer>
    </div>

    <script src="js/index.js"></script>
</body>
</html>
