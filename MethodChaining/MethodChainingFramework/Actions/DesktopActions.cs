using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MethodChainingFramework.PageObjects;
using Microsoft.VisualStudio.TestTools.UITesting;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Microsoft.VisualStudio.TestTools.UITest.Extension;

namespace MethodChainingFramework.Tests
{
    class DesktopActions : Desktop
        {

        Desktop desktop = new Desktop();

        public DesktopActions clickChromeIcon() {

            Mouse.DoubleClick(desktop.ChromeIcon);
            return this;
         }
    }
}
