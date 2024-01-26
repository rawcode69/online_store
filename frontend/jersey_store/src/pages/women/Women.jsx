import React from 'react'
import Women_Label from './women_label/Women_Label'
import { Footer, Navbar } from '../../components/Index'
import { Jersey_Display } from '../../containers'

const Women = () => {
  return (
    <div>
        <Navbar/>
        <Women_Label/>
        <Jersey_Display/>
        <Footer/>
    </div>
  )
}

export default Women
