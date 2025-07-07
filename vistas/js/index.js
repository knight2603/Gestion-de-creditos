document.addEventListener('DOMContentLoaded', function() {
    // Mobile menu toggle
    const toggler = document.querySelector(".toggler");
    const navMenu = document.querySelector(".nav-buttons");
    const navLinks = document.querySelector(".nav-links");
    
    toggler.addEventListener('click', function() {
        navMenu.classList.toggle("active");
        navLinks.classList.toggle("active");
        toggler.innerHTML = navMenu.classList.contains("active") ? 
            '<i class="bx bx-x"></i>' : '<i class="bx bx-menu"></i>';
    });

    // Smooth scrolling for navigation
    document.querySelectorAll('[data-section]').forEach(link => {
        link.addEventListener('click', function(e) {
            e.preventDefault();
            const sectionId = this.getAttribute('data-section');
            const section = document.getElementById(sectionId);
            
            if (section) {
                window.scrollTo({
                    top: section.offsetTop - 80,
                    behavior: 'smooth'
                });
                
                // Update active nav item
                document.querySelectorAll('.item').forEach(item => {
                    item.classList.remove('selected');
                });
                this.classList.add('selected');
            }
        });
    });

    // Update active nav item on scroll
    const sections = document.querySelectorAll('.section');
    const navItems = document.querySelectorAll('.item[data-section]');
    
    window.addEventListener('scroll', function() {
        let current = '';
        
        sections.forEach(section => {
            const sectionTop = section.offsetTop;
            const sectionHeight = section.clientHeight;
            
            if (pageYOffset >= (sectionTop - 150)) {
                current = section.getAttribute('id');
            }
        });
        
        navItems.forEach(item => {
            item.classList.remove('selected');
            if (item.getAttribute('data-section') === current) {
                item.classList.add('selected');
            }
        });
    });

    // Animation on scroll
    const animateOnScroll = function() {
        const elements = document.querySelectorAll('.items-box .item-container, .info-box, .nft-box');
        
        elements.forEach(element => {
            const elementPosition = element.getBoundingClientRect().top;
            const screenPosition = window.innerHeight / 1.3;
            
            if (elementPosition < screenPosition) {
                element.style.opacity = '1';
                element.style.transform = 'translateY(0)';
            }
        });
    };
    
    // Set initial state for animated elements
    document.querySelectorAll('.items-box .item-container, .info-box, .nft-box').forEach(el => {
        el.style.opacity = '0';
        el.style.transform = 'translateY(20px)';
        el.style.transition = 'opacity 0.6s ease, transform 0.6s ease';
    });
    
    window.addEventListener('scroll', animateOnScroll);
    animateOnScroll(); // Run once on load
    
    // Button hover effects
    const buttons = document.querySelectorAll('.info-btn, .nav-btn');
    buttons.forEach(button => {
        button.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-2px)';
        });
        
        button.addEventListener('mouseleave', function() {
            this.style.transform = 'translateY(0)';
        });
    });
    
    // Footer year update
    document.querySelector('.copyright p').innerHTML = 
        `&copy; ${new Date().getFullYear()} Neighborhood Store. Todos los derechos reservados.`;
});
