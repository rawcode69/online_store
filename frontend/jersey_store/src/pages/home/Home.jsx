import React from 'react';

import { Footer, Navbar } from '../../components/Index';
import { Brands, Label_All, Label_Kids, Label_Men_Women, Shop_All } from '.';
import { Home_Display } from '../../containers';
import HomeVideo from './home_video/HomeVideo';


const Home = () => {
  return (
    <div className='Home'>
      <Navbar/>
      <Label_All/>
      <Home_Display title = "FRESH OFF THE  PITCH"  click = "Explore" status="NEW"/>
      <Label_Kids/>
      <Home_Display title = "SCORE THE BIG SAVING" click = "Explore" status="10%"/>
      <Label_Men_Women/>
      <Home_Display title = "BEST SELLERS OF THE SEASON" click="Explore" status = "BEST"/>
      <Brands/>
      <Shop_All/>
      {/* <HomeVideo/> */}
      <Footer/>
    </div>
  )
}

export default Home;