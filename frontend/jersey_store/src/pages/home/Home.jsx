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
      <Home_Display/>
      <Label_Kids/>
      <Home_Display/>
      <Label_Men_Women/>
      <Home_Display/>
      <Brands/>
      <Shop_All/>
      <HomeVideo/>
      <Footer/>
    </div>
  )
}

export default Home;