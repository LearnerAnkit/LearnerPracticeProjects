using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;
using System.Windows.Input;
using System.Windows.Forms;
using System.Drawing;
using Microsoft.VisualStudio.TestTools.UITesting;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Microsoft.VisualStudio.TestTools.UITest.Extension;
using Microsoft.VisualStudio.TestTools.UITesting.WinControls;
using Keyboard = Microsoft.VisualStudio.TestTools.UITesting.Keyboard;

namespace MethodChainingFramework.PageObjects
{
    class Desktop : WinWindow
    {
        private WinListItem chromeIcon;

        public Desktop()
        {
           this.SearchProperties[WinWindow.PropertyNames.AccessibleName] = "Desktop 1";
           this.SearchProperties[WinWindow.PropertyNames.ClassName] = "#32769";
        }

        public WinListItem ChromeIcon {
            
            get{

                this.chromeIcon = new WinListItem(this);
                this.chromeIcon.SearchProperties[WinListItem.PropertyNames.Name] = "Google Chrome";
                return this.chromeIcon;
            }

        }
        

    }
}
