import React from 'react';
import { Footer, Navbar } from '../../components/Index';
import ShopAll from '../home/shop_all/ShopAll';
import Jersey_Container from './jersey_container/Jersey_Container';
import Imgae_1 from '../../assets/jersey_images/manchester_women/manchester_women_1.png'
import Image_2 from '../../assets/jersey_images/manchester_women/manchester_women_2.png'
import Images_3 from '../../assets/jersey_images/manchester_women/manchester_women_3.png'
import Images_4 from '../../assets/jersey_images/manchester_women/manchester_women_4.png'
import Images_5 from '../../assets/jersey_images/manchester_women/manchester_women_5.png'
import Images_6 from '../../assets/jersey_images/manchester_women/manchester_women_6.png'

const Jersey = () => {
  return (
    <div className='Jersey'>
        <Navbar/>
        <Jersey_Container 
          image_1 = {Imgae_1} 
          image_2 = {Image_2}
          image_3 = {Images_3}
          image_4 = {Images_4}
          image_5= {Images_5}
          image_6 = {Images_6}
          jersey_name = {"MANCHESTER UNITED"}
          jersey_year = {"2023/2024"}
          gender = {"Female"}
          price = {"Rs.3500.00"}
          description = {"Elevate your matchday experience at Old Trafford with the women's Manchester United FC 2023/24 Home Shirt by Adidas. Crafted from recycled polyester with AEROREADY technology, it ensures cool comfort. The Collegiate Red hue, geometric Lancashire Rose print inspired by Industrial Revolution bridges, 3-Stripes detailing, and iconic badges make it a stylish ode to football heritage.  Machine washable for easy care."}
        />
        <ShopAll/>
        <Footer/>
    
    </div>
  )
}

export default Jersey
