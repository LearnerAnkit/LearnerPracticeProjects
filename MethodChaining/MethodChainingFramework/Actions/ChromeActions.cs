using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MethodChainingFramework.PageObjects;
using Microsoft.VisualStudio.TestTools.UITesting;

namespace MethodChainingFramework.Actions
{
    public class ChromeActions
    {
        Chrome chrome = new Chrome();

        public ChromeActions clickNewTab()
        {
            Mouse.Click(chrome.ChromeTab);
            return this;
        }

        public ChromeActions enterSearchText(String searchText) {

            Keyboard.SendKeys(chrome.AddressBar, searchText);
            Keyboard.SendKeys("{ENTER}");
            return this;
        }

    }
}
