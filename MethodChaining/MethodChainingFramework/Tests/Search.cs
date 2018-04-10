using MethodChainingFramework.Actions;
using Microsoft.VisualStudio.TestTools.UITesting;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodChainingFramework.Tests
{
    [CodedUITest]
    public class Search : BaseTest
    {
        DesktopActions desktopActions = new DesktopActions();
        ChromeActions chromeActions = new ChromeActions();
        
        [TestMethod]
        public void SearchForTestTool() {

            desktopActions.clickChromeIcon();
            chromeActions.clickNewTab()
                         .enterSearchText("Method Chaining");
        }


    }
}
