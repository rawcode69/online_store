import React, { useState } from 'react';
import './navbar.css';
import logo from '../../assets/logo.png';
import bag from '../../assets/bag.png';
import heart from '../../assets/heart.png';
import user from '../../assets/user.png';
import search from '../../assets/search.png';
import { RiMenu3Line, RiCloseLine } from 'react-icons/ri';


const NavCategory = () => (
  <>
    <p><a href="#Men">MEN</a></p>
    <p><a href="#Women">WOMEN</a></p>
    <p><a href="#Kids">KIDS</a></p>
    <p><a href="#All">ALL</a></p>
  </>
);



const Navbar = () => {

  const [toggleMenu, setToggleMenu] = useState(false)

  return (

    <div className='dw__navbar'>
      <div className='dw__navbar_topbar'>
        <div className='dw__navbar_topbar_links'>
          <img src={user} alt="" />
          <div />
          <p><a href="">Help</a></p>
          <div />
          <p><a href="">Register</a></p>
          <div />
          <p><a href="">Contact Us</a></p>
        </div>
      </div>

      <div className='dw__navbar_midbar'>
        <div className='dw__navbar_midbar_links'>
          <div className='dw__navbar_midbar_links_logo'>
            <img src={logo} alt="logo" />
          </div >

          <div className='dw__navabar_midbar_links_buttons'>
            <NavCategory />
          </div>

          <div className='dw__navbar_midbar_links_right'>
            <div className='dw__navbar_midbar_links_right__search-bar'>

              <img src={search} alt="search" />

              <div>
                <input type="text" placeholder='Search for a produt' />
              </div>

            </div>

            <div className='dw__navbar_midbar_links_right__icons'>
              <img src={bag} alt="bag" />
              <img src={heart} alt="heart" />
              <img src={user} alt="user" />
            </div>

            <div className='dw_nabar-menu'>
              {toggleMenu
                ? <RiCloseLine color="#000000" size={27} onClick={() => setToggleMenu(false)} />
                : <RiMenu3Line color="#000000" size={27} onClick={() => setToggleMenu(true)} />}
              {toggleMenu && (
                <div className='dw_navabar-menu_container scale-up-top'>
                  <div className='dw_navabar-menu_container-category'>
                    <NavCategory />
                    <div className='dw_navabar-menu_container-icons'>
                      <img src={bag} alt="bag" />
                      <img src={heart} alt="heart" />
                      <img src={user} alt="user" />
                    </div>
                  </div>
                </div>
              )}
            </div>

          </div>

        </div>
      </div>

      <div className='dw__navbar_bottombar'>
        <div className='dw__navbar_bottombar_text'>

        </div>

      </div>

    </div>

  )
}

export default Navbar