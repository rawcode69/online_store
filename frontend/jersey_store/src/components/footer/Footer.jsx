import React from 'react';
import './footer.css'
import Logo from '../../assets/logo.png';
import FaceBook from '../../assets/fb.png';
import Insta from '../../assets/insta.png';
import TikTok from '../../assets/tiktok.png';
import Whtsapp from '../../assets/whatsapp.png';
import Payment from '../../assets/pay.png'
const Footer = () => {
  return (
    <div className='dw__footer'>

      <div className='dw__footer_container-left'>
        <h2>CONTACT US</h2>
        <p>+94 11111111</p>
      </div>

      <div className='dw__footer_container-mid'>
        <img src={Logo} alt="" style={{marginBottom : '1rem'}}/>
        <p style={{marginBottom : '1rem'}} className='dw__footer_container-mid_slogan'>“Play The Style, Score The  Look - Your Winning Jersey Destination”</p>

        <div className='dw__footer_container-mid_social-media'style={{marginTop:'1rem', marginBottom:'1rem'}}>
          <img src={FaceBook} alt="" />
          <img src={Whtsapp} alt="" />
          <img src={TikTok} alt="" />
          <img src={Insta} alt="" />
        </div>

        <p className='dw__footer_container-mid_rights'>2024 DRIBBLE WEAR. All Right Reserved</p>

        <div className='dw__footer_container-mid_button button_black'>Back to Top</div>
      </div>

      <div className='dw__footer_container-right'>
        <h2>WE ACCEPT</h2>
        <img src={Payment} alt="" />
      </div>
    </div>
  )
}

export default Footer