using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UITesting;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Microsoft.VisualStudio.TestTools.UITest.Extension;
using Microsoft.VisualStudio.TestTools.UITesting.WinControls;
using Keyboard = Microsoft.VisualStudio.TestTools.UITesting.Keyboard;

namespace MethodChainingFramework.PageObjects
{
    public class Chrome : WinClient
    {

        private WinButton chromeTab;
        private WinEdit addressBar;
        public Chrome()
        {
            #region Search Criteria
            this.SearchProperties[WinControl.PropertyNames.Name] = "Google Chrome";
            this.WindowTitles.Add("New Tab - Google Chrome");
            #endregion
        }

        public WinButton ChromeTab
        {

            get
            {
                this.chromeTab = new WinButton(this);
                this.chromeTab.SearchProperties[WinButton.PropertyNames.Name] = "New Tab";
                return this.chromeTab;
            }

        }

        public WinEdit AddressBar
        {
            get
            {
                this.addressBar = new WinEdit(this);
                this.addressBar.SearchProperties[WinEdit.PropertyNames.Name] = "Address and search bar";
                return this.addressBar;
            }
        }
    }
}

